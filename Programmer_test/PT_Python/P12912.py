def solution(a, b):
    answer = 0
    fr = min(a,b)
    se = max(a,b)
    for i in range(fr, se+1):
        answer += i
    return answer

print(solution(3,5))
print(solution(3,3))
print(solution(5,3))