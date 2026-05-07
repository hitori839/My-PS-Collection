# 프로그래머스 - 추억 점수
def solution(name, yearning, photo):
    answer = []
    # photo의 각 요소마다 name과 비교하여 yearning 점수를 더해준다.
    for i in range(len(photo)):
        a = 0
        for k in range(len(photo[i])):
            for j in range(len(name)):
                if photo[i][k] == name[j]:
                    a += yearning[j]
                    break
        answer.append(a)
    return answer

print(solution(["may", "kein", "kain", "radi"], [5, 10, 1, 3], [["may", "kein", "kain", "radi"], ["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]))