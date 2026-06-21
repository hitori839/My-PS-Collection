def solution(nums):
    answer = 0
    
    # 1. 3개 숫자의 최대 합(약 3,000)을 고려해 크기 3005의 소수 체크 배열 선언
    # (0: 소수 후보, 1: 소수 아님)
    check = [0] * 3005
    check[0] = 1 # 0은 소수가 아님
    check[1] = 1 # 1은 소수가 아님
    
    # 2. 에라토스테네스의 체를 이용하여 3000까지의 소수 판별 배열 생성
    for i in range(2, 3001):
        if check[i] == 0:
            temp = i * i
            while temp <= 3000:
                check[temp] = 1 # 소수의 배수들은 1로 마킹하여 제외
                temp += i
                
    # 3. 3중 루프를 통해 서로 다른 3개의 숫자 조합 탐색
    n = len(nums)
    for i in range(0, n - 2):
        for j in range(i + 1, n - 1):
            for k in range(j + 1, n):
                # 세 수의 합이 소수인지 check 배열로 바로 판별 (0이면 소수)
                sum_value = nums[i] + nums[j] + nums[k]
                if check[sum_value] == 0:
                    answer += 1
                    
    return answer

print(solution([1, 2, 3, 4]))       # 1
print(solution([1, 2, 7, 6, 4]))    # 4