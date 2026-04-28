#https://school.programmers.co.kr/learn/courses/30/lessons/42576
def solution(participant, completion):
    hash = {}
    for p in participant:
        if p in hash:
            hash[p] += 1
        else:
            hash[p] = 1
    for c in completion:
        if c in hash:
            hash[c] -= 1
    for key, value in hash.items():
        if value > 0:
            return key

pa = ["leo", "kiki", "eden"]
co = ["eden", "kiki"]
print(solution(pa, co))