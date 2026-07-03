import heapq

def solution(operations):
    min_heap = []
    max_heap = []
    
    for op in operations:
        cmd, val = op.split()
        num = int(val)
        
        if cmd == 'I':
            heapq.heappush(min_heap, num)
            heapq.heappush(max_heap, -num) 
            
        else:
            if min_heap: 
                if num == 1:
                    max_val = -heapq.heappop(max_heap)
                    min_heap.remove(max_val)
                    heapq.heapify(min_heap)
                else:
                    min_val = heapq.heappop(min_heap)
                    max_heap.remove(-min_val)
                    heapq.heapify(max_heap) 

    if not min_heap:
        return [0, 0]
    else:
        return [-max_heap[0], min_heap[0]]

print(solution(["I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"])) # [0, 0]
print(solution(["I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"])) # [333, -45]