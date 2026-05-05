import heapq

def solution(scoville, K):
    answer = 0
    
    # 1. 기존 리스트를 최소 힙(Min-Heap) 구조로 변환
    heapq.heapify(scoville)
    
    # 2. 가장 작은 값이 K보다 작을 동안 반복
    while scoville[0] < K:
        
        # 3. 모든 음식을 다 섞었는데도 K를 못 넘는 경우 체크
        if len(scoville) < 2:
            return -1
        
        # 4. 가장 작은 두 음식을 꺼냄
        first = heapq.heappop(scoville)
        second = heapq.heappop(scoville)
        
        # 5. 음식을 섞어서 다시 힙에 넣음
        new_scoville = first + (second * 2)
        heapq.heappush(scoville, new_scoville)
        
        answer += 1
        
    return answer