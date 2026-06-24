def solution(s):
    answer = []
    alpha = [-1 for x in range(26)]
    for i in range(len(s)):
        if alpha[ord(s[i]) - ord('a')] == -1:
            answer.append(-1)
        else:
            answer.append(i - alpha[ord(s[i]) - ord('a')])
        alpha[ord(s[i]) - ord('a')] = i
    return answer

print(solution("banana"))
print(solution("foobar"))