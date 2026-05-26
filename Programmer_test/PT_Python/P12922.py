def solution(n):
    answer = ''
    for i in range(int(n/2)):
        answer += '수박'
    if (n % 2 == 0):
        return answer
    else:
        answer += '수'
        return answer

print(solution(3))
print(solution(4))