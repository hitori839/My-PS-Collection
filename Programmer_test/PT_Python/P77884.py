def solution(left, right):
    answer = 0
    # 1. right 크기만큼의 약수 개수 저장 배열 선언
    divisor = [0] * (right + 1)
    
    # 2. 모든 숫자는 기본적으로 1을 약수로 가지므로 1로 초기화
    for i in range(0, right + 1):
        divisor[i] = 1
        
    temp = 0
    # 3. 에라토스테네스의 체와 유사하게 배수들의 약수 개수를 누적 카운팅
    for i in range(2, right + 1):
        temp = i
        while temp <= right:
            divisor[temp] += 1
            temp += i  # i의 배수로 이동
            
    # 4. left부터 right까지 돌며 짝수면 더하고, 홀수면 빼기
    for i in range(left, right + 1):
        if (divisor[i] % 2) == 0:
            answer += i
        else:
            answer -= i
            
    return answer

print(solution(13, 17))
print(solution(24, 27))