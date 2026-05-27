def solution(s):
    answer = ''
    temp = 0
    for i in s:
        if (i == ' '):
            answer += ' '
            temp = 0
        else:
            if temp % 2 == 0:
                answer += i.upper()
            else:
                answer += i.lower()
            temp += 1
    return answer

print(solution("try hello world"))