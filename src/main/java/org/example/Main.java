package org.example;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 課題1 文字列のリストを作る。 1.要素数は10個 2.その文字列に対して、文字数が2以上のものを抽出して、文字列に変換して、カンマ区切りで行う。 3.その文字列を出力して下さい。
 * <p>
 * <p>
 * 課題2 数値のリストを作る。 1.要素数は10個 2.その数値の中の奇数のものだけ抽出して、 平均値を出してください。 3.その平均値を出力して下さい。
 */
public class Main {

  public static void main(String[] args) {
    //課題1
    List<String> studentsList = List.of("岡田", "草", "マリー", "ジョアナ", "山", "柳田", "ロ",
        "超年総国子", "岸和田", "ピカチュウ");
    //　要素数の確認
    System.out.println(studentsList.toArray().length);

    String studentStringList = studentsList.stream()
        .filter(v -> v.length() >= 2) // studentStringListの要素の2文字以上のだけ抽出する
        .collect(Collectors.joining(",")); // カンマ区切りにする

    System.out.println(studentStringList);

    //課題2
    List<Integer> numList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    double averageList = numList.stream()
        .filter(v -> v % 2 != 0) //奇数を抽出する
        .mapToInt(Integer::intValue)
        .average() //　平均値を計算
        .getAsDouble(); // double型の値として取得する

    System.out.println(averageList);

  }
}
