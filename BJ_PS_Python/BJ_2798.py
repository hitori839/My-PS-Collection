#두 개의 정수를 빈칸을 기준으로 분리해서 입력 받음
a, b = map(int, input().split(" "))
           
#이제 카드에 쓰여 있는 수를 빈칸을 기준으로 분리해서 입력 받음
cards = list(map(int, input().split(" ")))


max_sum = 0
sum = 0

#세 장의 카드를 뽑는 경우의 수를 모두 계산해서, 그 합이 max_sum을 넘지 않으면서 가장 큰 값을 찾음
for i in range(a):
    sum = 0
    for j in range(i + 1, a):
        for k in range(j + 1, a):
            sum = cards[i] + cards[j] + cards[k]
            if sum > max_sum and sum <= b:
                max_sum = sum

print(max_sum)