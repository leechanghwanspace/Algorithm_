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

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

BufferedReader: 입력을 버퍼링해서 처리하는 클래스입니다.
InputStreamReader: System.in으로부터 입력 스트림을 읽어오도록 연결해줍니다.
BufferedReader는 InputStreamReader와 결합하여 입력을 효율적으로 처리할 수 있습니다.
BufferedReader는 줄 단위로 입력을 처리할 수 있는 메서드인 **readLine()**을 제공하여, 입력을 더 빠르게 처리합니다.
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

BufferedWriter: 출력을 버퍼링해서 처리하는 클래스입니다. 버퍼에 데이터를 모아둔 뒤 한꺼번에 출력합니다.
OutputStreamWriter: System.out과 연결된 출력 스트림을 처리합니다.
BufferedWriter는 OutputStreamWriter와 결합하여 출력을 효율적으로 처리할 수 있습니다.
int T = Integer.parseInt(br.readLine());

br.readLine(): 입력을 한 줄씩 읽어옵니다. 여기서는 테스트 케이스 수 T를 입력받습니다.
Integer.parseInt(): 읽어온 문자열을 정수로 변환하는 메서드입니다. 입력받은 테스트 케이스 수를 정수로 변환합니다.
for (int i = 0; i < T; i++) {

테스트 케이스의 개수만큼 반복하기 위한 for 반복문입니다.
i = 0부터 시작해 T번 반복하며, 각 테스트 케이스에서 입력받은 두 숫자를 더하는 작업을 진행합니다.
String[] input = br.readLine().split(" ");

br.readLine(): 한 줄의 입력을 읽어옵니다. 여기서 각 줄에는 두 개의 숫자가 입력됩니다.
split(" "): 입력된 문자열을 공백 기준으로 나눕니다. 즉, 한 줄에 입력된 두 개의 숫자를 배열로 분리합니다.
int a = Integer.parseInt(input[0]); int b = Integer.parseInt(input[1]);

각각 나눈 문자열(input[0], input[1])을 정수로 변환합니다.
a와 b는 각각 공백으로 구분된 두 개의 숫자입니다.
bw.write((a + b) + "\n");

bw.write(): 두 정수의 합을 버퍼에 기록합니다. 출력은 아직 하지 않고, 버퍼에 저장된 상태입니다.
\n을 사용하여 각 결과를 줄바꿈 처리합니다.
bw.flush();

flush(): 버퍼에 쌓인 데이터를 한 번에 출력합니다. BufferedWriter는 버퍼에 데이터를 모아두고, flush()를 호출하면 그동안 모아둔 데이터를 한꺼번에 출력하게 됩니다.
bw.close(); br.close();

자원 해제: 사용한 BufferedWriter와 BufferedReader를 닫아서 자원을 정리합니다. 입출력 작업이 끝나면 반드시 자원을 해제해야 합니다.

---
