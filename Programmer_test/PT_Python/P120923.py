def solution(num, total):
    answer = [0] * num
    
    # 1. 개수(num)가 홀수인 경우
    if (num % 2) == 1:
        ind1 = total // num # 정확한 중앙값 계산
        for i in range(num // 2 + 1):
            # 배열의 정중앙에서부터 양방향으로 1씩 확장하며 값을 채움
            answer[len(answer) // 2 - i] = ind1 - i
            answer[len(answer) // 2 + i] = ind1 + i
            
    # 2. 개수(num)가 짝수인 경우
    else:
        ind1 = total // num     # 가운데 두 수 중 왼쪽 값
        ind2 = total // num + 1 # 가운데 두 수 중 오른쪽 값
        for i in range(num // 2):
            # 가운데 두 지점부터 시작하여 바깥쪽으로 1씩 확장하며 값을 채움
            answer[len(answer) // 2 - 1 - i] = ind1 - i
            answer[len(answer) // 2 + i] = ind2 + i
            
    return answer

print(solution(3, 12))  # [3, 4, 5]
print(solution(5, 15))  # [1, 2, 3, 4, 5]
print(solution(4, 14))  # [2, 3, 4, 5]
print(solution(5, 5))   # [-1, 0, 1, 2, 3]