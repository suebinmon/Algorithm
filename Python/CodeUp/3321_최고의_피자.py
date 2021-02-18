# vega 선생님은 Miss 피자 가게의 단골 손님이다.
# 그는 이번 달부터 절약 생활을 시작했다.
# 그래서 그는 피자 가게에서 주문할 수 있는 피자 중 1 달러 당 열량이 최대가 되는 피자를 주문하고 싶어한다.
# 이러한 피자를 "최고의 피자"라고 부르기로 하자.
# "최고의 피자"는 1종류가 아니다.
# Miss 피자는 N 종류의 토핑에서 여러 종류를 자유롭게 선택하여, 도우 위에 올려 주문할 수있다.
# 같은 토핑을 2 개 이상 올릴 수 없다.
# 도우에 토핑을 하나도 하지 않은  피자도 주문할 수있다.
# 도우의 가격은 A 달러이며, 토핑의 가격은 모두 B 달러이다.
# 실제 피자 가격은 도우의 가격과 토핑 가격의 합계이다.
# 즉, 토핑을 k 종류 (0 ≦ k ≦ N) 한 피자의 가격은 A + k × B 원이다.
# 피자 전체의 칼로리는 도우 열량과 토핑 칼로리의 합계이다.
# 도우의 가격과 토핑의 가격, 그리고 도우와 각 토핑 열량 값이 주어 졌을 때, "최고의 피자"의 1 달러 당 열량의 수를 구하는 프로그램을 작성하시오.

n = int(input())
a, b = map(int, input().split())
doughCal = int(input())
toppingCal = []

for i in range(n):
    toppingCal.append(int(input()))

toppingCal.sort(reverse=True)

bestPizzaCal = int(doughCal // a)
toppingCalSum = 0
for i in range(n):
    toppingCalSum += toppingCal[i]
    cal = (doughCal + toppingCalSum) // (a+(b*(i+1)))
    if (bestPizzaCal < cal):
        bestPizzaCal = cal

print(bestPizzaCal)
 