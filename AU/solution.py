from fractions import Fraction

n = int(input())
while n > 0:
  p, q = map(int, input().split(' / '))
  f = Fraction(p, q)
  print("%d / %d" % (f.numerator, f.denominator))
  n -= 1