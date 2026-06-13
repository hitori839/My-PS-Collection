def solution(n, m):
    answer = [1, 1]
    mi = min(n, m)
    ma = max(n, m)
    for i in range(1, mi+1):
        if ((m % i == 0) and (n % i ==0)):
            answer[0] = i
    for i in range(ma, mi * ma + 1):
        if ((i % m == 0) and (i % n == 0)):
            answer[1] = i
            break
    return answer

print(solution(2, 5))