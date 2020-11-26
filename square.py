#2차원 배열 생성 (100x100) (모서리의 좌표들이 100 이하일 때를 가정하였으며,
# 더 큰 정수가 들어올 때는 range 안의 수만 변경해 주면 됨)
paper = [[0 for _ in range(101)] for _ in range(101)]

x = int(input("Input the number of squares: "))

for _ in range(x):
    #제일 왼쪽 상단 모서리의 x좌표와 y좌표, 제일 오른쪽 하단 모서리의 x좌표와 y좌표만 추출
    x1, y1, x2, y2 = map(int, input().split())
    
    #사각형 부분만 1로 바꾸기
    for i in range(x1, x2):
        for j in range(y1, y2):
            paper[i][j] = 1

answer = 0
for row in paper:
    answer += sum(row)
print(answer)