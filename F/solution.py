import sys
from functools import cmp_to_key

def sorted_by(a, b):
  if abs(ord(a) - ord(b)) == 32:
    return ord(a) - ord(b)
  else:
    # normalize to lower
    return ord(a.lower()) - ord(b.lower())

# faster than itertools permutations
def gen_permuation_sorted(letters, current_str):
  if len(letters) == 0:
    yield current_str
  else:
    unique_letters = set()
    for i in range(len(letters)):
      if not letters[i] in unique_letters:
        unique_letters.add(letters[i])
        yield from gen_permuation_sorted(letters[:i]+letters[i+1:], current_str + letters[i])

n = int(input())
for i in range(n):
  word = sorted(list(sys.stdin.readline().strip()), key=cmp_to_key(sorted_by))
  for word in gen_permuation_sorted(word, ""):
    sys.stdout.write('{}\n'.format(word))
