def solution(seoul):
    a = -1
    for i in range(len(seoul)):
        if seoul[i] == "Kim":
            a = i
            break
    return "김서방은 %d에 있다" %a

print(solution(["Jane", "Kim"]))