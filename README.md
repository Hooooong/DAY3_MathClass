JAVA Programing
----------------------------------------------------
#### 3일차

###### 예제
____________________________________________________

  - [1부터 Max까지 총, 짝수, 홀수 합 구하기 ](https://github.com/Hooooong/DAY3_MathClass/blob/master/src/AlgoMain.java)
  - [로또 번호 구하기](https://github.com/Hooooong/DAY3_MathClass/blob/master/src/AlgoMath.java)

###### 공부정리
____________________________________________________

  - Math Class

    [_java.lang.Math_](https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html)<br>
    JAVA에서 제공해주는 기본 API 중 하나이다. 기본적인 수학 함수를 제공한다.

    - Math Class 생성자

        - Math Class 는 생성자가 없고, static 클래스이다.

    - [Math Class의 주요 메소드](https://github.com/Hooooong/DAY3_MathClass/blob/master/src/AlgoMath.java)

        - abs() : 절대값

          ```java
          /*
           * 절대값 구하는 메소드
           * Math.ads(정수(int));
           * RETURN : int
           */
           int a = Math.abs(-123);
           // 출력 : 123
          ```

        - round() : 반올림

          ```java
          /*
           * 반올림 구하는 메소드
           * Math.round(실수(float));
           * RETURN : long
           */
           long b = Math.round(123.4);
           // 출력 : 123
          ```

        - ceil() : 올림

          ```java
          /*
           * 올림 구하는 메소드
           * Math.ceil(실수(double));
           * RETURN : long;
           */
           double d = Math.ceil(3123.1414);
           // 출력 : 3124
          ```

        - floor() : 내림

          ```java
          /*
           * 내림을 구하는 메소드
           * Math.floor(123.45);
           * RETURN : double
           */
           double e = Math.floor(123.45);
           // 출력 : 123.00
          ```

        - random() : 0.0 <= n < 0.9 까지 랜덤한 실수

          ```java
          /*
           * 0.0 부터 0.9 까지의 랜덤한 실수를 구하는 메소드
           * x : 0.0 * x <= n < 0.9 * x
           * y : 0.0 + y <= n < 0.9 + y
           */
          Math.random(x) + y;
          ```

  - Random Class

    [_java.util.Random_](https://docs.oracle.com/javase/7/docs/api/java/util/Random.html)<br>
    의사난수 발생(Pseudorandom number generator)을 해주는 Class 이다.

    - Random Class 생성자

        ```java
        // 기본적인 생성자
        Random random = new Random();
        // Seed 값 추가한 생성자
        Random random = new Random(long seed);
        ```

    - Math Class의 주요 메소드

        - nextInt() : 정수 난수 생성

          ```java
          Random random = new Random();

          /*
           * 0부터 99 까지 랜덤한 숫자를 구하는 메소드
           */
          random.nextInt(100);

          /*
           * 1부터 100까지 랜덤한 숫자를 구하는 메소드
           */
          int number = random.nextInt(100) + 1;
          ```
