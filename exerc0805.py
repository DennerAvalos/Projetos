n = int(input())
s = input()

count = 0
start = 0
current = s[0]

for i in range(1, n):
    if s[i] != current:
        if i - start > 1 and current == 'a':
            count += s[start:i].count('a')
        start = i
        current = s[i]

if n - start > 1 and current == 'a':
    count += s[start:].count('a')

print(count)


