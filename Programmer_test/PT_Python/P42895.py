#N으로 표현
def solution(N, number):
    if N == number:
        return 1
    
    #N을 1개부터 8개까지 사용하여 만들 수 있는 숫자들을 저장하는 리스트
    s = [set() for _ in range(9)]
    
    for i in range(1,9):
        #N을 i개 사용하여 만들 수 있는 숫자들을 추가
        s[i].add(int(str(N) * i))
        
        #i개의 N을 사용하여 만들 수 있는 숫자들을 계산
        for j in range(1, i):
            for op1 in s[j]:
                for op2 in s[i - j]:
                    s[i].add(op1 + op2)
                    s[i].add(op1 - op2)
                    s[i].add(op1 * op2)
                    if op2 != 0:
                        s[i].add(op1 // op2)

        #number이 i개의 N을 사용하여 만들 수 있는 숫자들에 있는지 확인                
        if number in s[i]:
            return i
        
    return -1

#테스트 케이스
print(solution(5, 12))  # Expected output: 4
print(solution(2, 11))  # Expected output: 3