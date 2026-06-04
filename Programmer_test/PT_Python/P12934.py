def solution(n):
    i = 1
    while(i**2 <= n):
        if i**2 == n:
            return (i+1)**2
        i += 1
    return -1

print(solution(121))
print(solution(3))