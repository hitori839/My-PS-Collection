def solution(k, m, score):
    answer = 0
    score.sort(reverse = True)
    nbox = 0
    while (nbox + m <= len(score)):
        answer += score[nbox + m - 1] * m
        nbox += m
    return answer

print(solution(3, 4, [1, 2, 3, 1, 2, 3, 1]))
print(solution(4, 3, [4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2]))