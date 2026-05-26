def solution(s, n):
    answer = ''
    for i in s:
        if ('a' <= i <= 'z'):
            i = chr(ord(i) + n)
            if (i > 'z'):
                i = chr(ord(i) - 26)
            answer += i
        elif ('A' <= i <= 'Z'):
            i = chr(ord(i) + n)
            if (i > 'Z'):
                i = chr(ord(i) - 26)
            answer += i
        else:
            answer += i
    return answer

print(solution("AB",1))
print(solution("z",1))
print(solution("a B z",4))