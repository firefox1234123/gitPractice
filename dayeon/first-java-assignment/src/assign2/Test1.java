package assign2;

// 다음 조건을 만족하도록 Cylinder 클래스를 작성합니다.
class Cylinder {

	// 원주율 3.14를 정적 상수 PI로 선언과 동시에 초기화
    final static double PI = 3.14;
    // 정수형 원의 중심 좌표 x, y를 선언
    int x, y;
    // 실수형 원의 반지름 r을 선언
    double r;
    // 정수형 원기둥의 높이 height를 10으로 선언과 동시에 초기화
    int height = 10;
	// 생성자1: 정수 인자 x, y 와 실수 인자 r을 전달 받아서 해당 필드 값을 초기화
    Cylinder(int x, int y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // 생성자2: 정수 인자 x, y, height 와 실수 인자 r을 전달 받아서 해당 필드 값을 초기화
    Cylinder(int x, int y, double r, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.r = r;
    }

	// circleArea 메서드: PI를 이용하여 원의 면적 반환
    double circleArea() {
        return r * r * PI;
    }

    // volume 메서드: 면적과 높이를 이용하여 부피를 반환
    double volume() {
        return circleArea() * height;
    }

    // surfaceArea 메서드: PI를 이용하여 원기둥의 겉넓이를 반환
    double surfaceArea() {
        return 2 * PI * r * r + 2 * PI * r *  height;
    }

    // move 메서드: 정수 인자 dx, dy를 전달 받아서 원의 중심 좌표를 이동
    // - 예: 필드 x가 1이고 dx가 10이면 x는 11로 변경되어야 함
    // 객체 자신을 반환
    Cylinder move(int dx, int dy) {
        x += dx;
        y += dy;
        return this;
    }

	void print() {
		System.out.println("<"+x+","+y+":"+r+">");
	}
}


// 메인메서드 수행시 이렇게 출력되도록
//<13,15:6.0>
//113.04
//1130.4
//602.88
//<17,25:10.0>
//314.0
//1570.0
//942.0
public class Test1 {
	public static void main(String[] args) {
        Cylinder c1 = new Cylinder(3, 5, 6);
		c1.move(10,10).print();
		System.out.println(c1.circleArea());
        System.out.println(c1.volume());
        System.out.println(c1.surfaceArea());

        Cylinder c2 = new Cylinder(5, 8, 10, 5);
        c2.move(12,17).print();
        System.out.println(c2.circleArea());
        System.out.println(c2.volume());
        System.out.println(c2.surfaceArea());
	}
}
