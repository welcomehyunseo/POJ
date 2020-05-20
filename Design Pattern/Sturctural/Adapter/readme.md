# Adapter

## 어뎁터의 의미
* 적용, 적용시킬 수 있는, 적용시키는, 적용시키다.

## 패턴 구조

<img src="https://t1.daumcdn.net/cfile/tistory/24231F4C575EACA210"/>

<a href="https://jusungpark.tistory.com/22">자료 출처</a>

## 설명
어뎁터 패턴은 외부의 소스 코드를 사용하기 위해 우리에게 맞는 형태로 바꾸어주는 중간 매개물 역할을 수행합니다.
예를 들어 외부의 라이브러리나 플러그인 등을 우리의 코드에 사용하려면 형식을 맞춰줘야 되는데, 우리와 다른 것이 연결될 수 있도록
중간 역할을 수행하는 것이 Adapter Pattern 입니다.

<img src="https://lh3.googleusercontent.com/proxy/VEVJcjBkbRX8_PGtbsQvN2zJjtLbJYWBXDlIXyUILIE0t9PtZmCcnLTCTGy3-ebI39b49Bbf7oq0dvdptM20x6V-_9d0GoPzhxVZ3PnBIkhEue5xqq_GDzbieJxJOn7lAshxJb3S9BXsbEsBpN2KEh5RM1ZSWuatOAkm9dQTRORHpXEOOhR9dTUZZWboBaSEuLLEWQpf58x6-mtMMfqvl-fTxA9AjlEB7_H9e4d9-SnY2Vj7egeAEC60Ox_VDMhbHxUMwOi0Mbv8"/>
<a href="https://kimch3617.tistory.com/entry/%EC%96%B4%EB%8C%91%ED%84%B0-%ED%8C%A8%ED%84%B4-adapter-pattern">자료 출처</a>

# 예제
## 배경
USB 4.0이 지원안되는 컴퓨터를 사용하고 있다. 오로직 USB 3.0 만을 사용할 수 있는 컴퓨터에 USB 4.0 을 사용하기 위해서는 변환 어뎁터가 필요하다.

## 다이어그램

![주석 2020-05-21 013949](https://user-images.githubusercontent.com/48713654/82473071-012b2280-9b04-11ea-8791-ae412078fa2d.png)

위 다이어그램과 같이 Computer 클래스에 USB 4.0을 사용하기 위해 USB4Adapter을 별도로 만들어 주었다. 

`
Computer < USB4Adapter < USB4
`

로 연결되는 방식이다. USB 의 함수을 공통 정의하기 위해 USB 인터페이스를 생성하여 USB3 과 USB4Adapter 에 상속하였다.

## 코드
