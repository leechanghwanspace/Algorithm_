# [Bronze IV] 빠른 A+B - 15552 

[문제 링크](https://www.acmicpc.net/problem/15552) 

### 성능 요약

메모리: 289136 KB, 시간: 868 ms

### 분류

구현, 사칙연산, 수학

### 제출 일자

2024년 9월 29일 15:52:07

### 문제 설명

<p>본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.</p>

<p>C++을 사용하고 있고 <code>cin</code>/<code>cout</code>을 사용하고자 한다면, <code>cin.tie(NULL)</code>과 <code>sync_with_stdio(false)</code>를 둘 다 적용해 주고, <code>endl</code> 대신 개행문자(<code>\n</code>)를 쓰자. 단, 이렇게 하면 더 이상 <code>scanf</code>/<code>printf</code>/<code>puts</code>/<code>getchar</code>/<code>putchar</code> 등 C의 입출력 방식을 사용하면 안 된다.</p>

<p>Java를 사용하고 있다면, <code>Scanner</code>와 <code>System.out.println</code> 대신 <code>BufferedReader</code>와 <code>BufferedWriter</code>를 사용할 수 있다. <code>BufferedWriter.flush</code>는 맨 마지막에 한 번만 하면 된다.</p>

<p>Python을 사용하고 있다면, <code>input</code> 대신 <code>sys.stdin.readline</code>을 사용할 수 있다. 단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 <code>.rstrip()</code>을 추가로 해 주는 것이 좋다.</p>

<p>또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.</p>

<p>자세한 설명 및 다른 언어의 경우는 <a href="http://www.acmicpc.net/board/view/22716">이 글</a>에 설명되어 있다.</p>

<p><a href="http://www.acmicpc.net/blog/view/55">이 블로그 글</a>에서 BOJ의 기타 여러 가지 팁을 볼 수 있다.</p>

### 입력 

 <p>첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.</p>

### 출력 

 <p>각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.</p>

---
## 1. BufferedReader와 BufferedWriter 사용

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));<br>
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));<br>
```

- BufferedReader와 BufferedWriter는 표준 입력과 출력을 처리할 때 성능을 높이기 위해 버퍼링을 사용하는 클래스로, 기본 Scanner나 System.out.println보다 빠른 입출력을 제공합니다.
- 특히, 많은 양의 데이터를 입력받거나 출력할 때 유리합니다. 본 코드에서는 BufferedReader를 통해 입력을 처리하고, BufferedWriter를 통해 출력을 모아 한 번에 처리합니다.

## 2. 테스트 케이스 입력 처리

```java
int T = Integer.parseInt(br.readLine());<br>
```

- 먼저, 입력받을 테스트 케이스 수를 읽고, 이를 정수로 변환하여 T에 저장합니다.

## 3. 반복문을 통한 덧셈 처리

```java
for (int i = 0; i < T; i++) {<br>
  String[] input = br.readLine().split(" ");<br>
  int a = Integer.parseInt(input[0]);<br>
  int b = Integer.parseInt(input[1]);<br>
 
   bw.write((a + b) + "\n");<br>
}
```

- 테스트 케이스 수만큼 반복하며 각 케이스에서 두 개의 숫자를 입력받아 그 합을 구하고, 그 결과를 BufferedWriter에 기록합니다.
- 입력된 두 수는 공백으로 구분되어 있으므로, split(" ")을 사용해 공백을 기준으로 문자열을 나눕니다.
- write() 메서드를 통해 덧셈 결과를 버퍼에 저장합니다. 개행을 위해 "\n"을 추가합니다.

## 4. 출력 및 자원 해제

```java
bw.flush();<br>
bw.close();<br>
br.close();<br>
```

- bw.flush()는 버퍼에 저장된 내용을 실제로 출력하는 역할을 합니다. 버퍼에 있는 내용을 한꺼번에 처리하여 입출력 성능을 극대화할 수 있습니다.
- 마지막으로, BufferedReader와 BufferedWriter 자원을 각각 close()하여 사용을 종료합니다.

---
