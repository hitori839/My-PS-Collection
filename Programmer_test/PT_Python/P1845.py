# 폰켓몬
def solution(nums):
    pok = {}
    # nums의 길이의 절반보다 많은 종류의 폰켓몬을 가져갈 수 없으므로, 
    # nums의 길이의 절반과 pok의 길이를 비교하여 작은 값을 반환한다.
    for i in nums:
        if i in pok:
            pok[i] = pok.get(i) + 1
        else:
            pok[i] = 1
    if (int(len(nums)/2)) <= len(pok):
        return int(len(nums)/2)
    else:
        return len(pok)

print(solution([3, 1, 2, 3]))