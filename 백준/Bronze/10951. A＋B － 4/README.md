# [Bronze V] A+B - 4 - 10951 

[문제 링크](https://www.acmicpc.net/problem/10951) 

### 성능 요약

메모리: 17924 KB, 시간: 180 ms

### 분류

구현, 사칙연산, 수학

### 제출 일자

2024년 9월 29일 23:39:20

### 문제 설명

<p>두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.</p>

### 입력 

 <p>입력은 여러 개의 테스트 케이스로 이루어져 있다.</p>

<p>각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)</p>

### 출력 

 <p>각 테스트 케이스마다 A+B를 출력한다.</p>

---

## EOF (End of File)의 개념

- EOF는 입력 스트림의 끝을 의미합니다. 예를 들어, 콘솔에서 사용자가 더 이상 입력을 제공하지 않을 때나 파일의 모든 데이터를 읽었을 때 도달하는 지점입니다.
- 일반적으로 파일을 읽거나 콘솔에서 입력을 받을 때, EOF는 입력이 더 이상 존재하지 않는 상태를 의미하며, 이를 감지하여 입력을 종료할 수 있습니다.

---

## 1. Scanner 사용

```java
while (sc.hasNextInt()) {  
...
}
```

- hasNext(): 입력 스트림에 다음 토큰이 있는지 확인하는 메서드. 다음에 읽을 것이 있으면 true, 없으면 false를 반환합니다.
- hasNextInt(): 입력 스트림에 다음에 읽을 정수가 있는지 확인합니다.

## 2. BufferedReader와 BufferedWriter 사용

```java
while ((line = br.readLine()) != null) {
   String[] numbers = line.split(" ");
   int a = Integer.parseInt(numbers[0]);
   int b = Integer.parseInt(numbers[1]);

   System.out.println(a + b);  // 합을 출력
}
```

- BufferedReader는 입력 스트림에서 데이터를 한 줄씩 읽는 방식으로 주로 사용됩니다. EOF를 처리하기 위해선 readLine() 메서드를 사용하며, 입력 스트림이 끝나면 null을 반환합니다. 
--- 
