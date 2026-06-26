def solution(dots):
    ma_x, ma_y, mi_x, mi_y = dots[0][0], dots[0][1], dots[0][0], dots[0][1]
    for i in range(1,4):
        if (ma_x < dots[i][0]):
            ma_x = dots[i][0]
        if (mi_x > dots[i][0]):
            mi_x = dots[i][0]
        if (ma_y < dots[i][1]):
            ma_y = dots[i][1]
        if (mi_y > dots[i][1]):
            mi_y = dots[i][1]
    return (ma_x - mi_x) * (ma_y - mi_y)

print(solution([[1, 1], [2, 1], [2, 2], [1, 2]]))
print(solution([[-1, -1], [1, 1], [1, -1], [-1, 1]]))