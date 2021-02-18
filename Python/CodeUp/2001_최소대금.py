# 파파 파스타 가게는 점심 추천 파스타와 생과일 쥬스 세트 메뉴가 인기가 좋다.
# 이 세트 메뉴를 주문하면 그 날의 3 종류의 파스타와 2 종류의 생과일 쥬스에서 하나씩 선택한다.
# 파스타와 생과일 쥬스의 가격 합계에서 10%를 더한 금액이 대금된다.
# 어느 날의 파스타와 생과일 쥬스의 가격이 주어 졌을 때, 그 날 세트 메뉴의 대금의 최소값을 구하는 프로그램을 작성하라.

pasta = []
juice = []
result = 0
for i in range(5) :
    if i < 3:
        pasta.append(float(input()))
    else:
        juice.append(float(input()))

pasta.sort()
juice.sort()

result = float(pasta[0] + juice[0])
result += float(format(result / 10, '.1f'))
print(result)


# 다른 사람 풀이
# pasta_1 = int(input())
# pasta_2 = int(input())
# pasta_3 = int(input())

# juice_1 = int(input())
# juice_2 = int(input())

# cheapest_pasta = min(pasta_1, pasta_2, pasta_3)
# cheapest_juice = min(juice_1, juice_2)

# result = (cheapest_juice + cheapest_pasta) * 1.1
# print("%.1f" % result)