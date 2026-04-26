#분배합

a = int(input())
Con = 0

#생성자 구하기
for i in range(1, a):
    sum = i
    j = i
    while j > 0:
        sum += j % 10
        j //= 10
    if sum == a:
        Con = i
        break

print(Con)