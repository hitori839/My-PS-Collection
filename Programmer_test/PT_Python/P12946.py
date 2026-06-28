answer = []

def solution(n):
    hanoi(n, 1, 3, 2)
    return answer

def hanoi(disks, start, end, mid):
    if (disks == 1):
        answer.append([start, end])
    else:
        hanoi(disks-1,start,mid,end)
        answer.append([start, end])
        hanoi(disks-1,mid, end, start)

print(solution(2))