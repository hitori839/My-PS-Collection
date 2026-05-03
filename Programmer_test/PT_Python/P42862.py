#체육복

def solution(n, lost, reserve):
    answer = 0
    wear = []
    # 1. 전체 학생 수 만큼의 배열을 만들어서 1로 초기화
    for i in range(n+1):
        wear.append(1)
    
    # 2. 잃어버린 학생은 -1, 여벌이 있는 학생은 +1
    for i in lost:
        wear[i] -= 1
    for i in reserve:
        wear[i] += 1

    # 3. 잃어버린 학생이 여벌이 있는 학생에게 빌릴 수 있는지 확인
    for i in range(1,n+1):
        if wear[i] == 0:
            for j in range(i-1,i+2,2):
                if (1 <= j <= n):
                    if wear[j] > 1:
                        wear[i] += 1
                        wear[j] -= 1
                        break
    for i in range(1, n+1):
        if wear[i] != 0:
            answer += 1
    return answer

print(solution(5, [2, 4], [1, 3, 5]))