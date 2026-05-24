def solution(n):
    answer = 0
    check = [0 for i in range(n+1)]
    for i in range(2, n+1):
        if (check[i] == 0):
            answer += 1
            check[i] = 1
            temp = i * i
            while (temp <= n):
                check[temp] = 1
                temp += i
        else:
            continue
    return answer

print(solution(10))
print(solution(5))