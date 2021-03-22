package com.avp.homework8inheritanceandinterfaces.task3mathoperation.service;
/*
Необходимо создать функциональный интерфейс для представления математической операции MathOperation с методом double compute(double a, double b).

Разработать на каждую математическую операцию (сложение, вычитание, умножение, деление) отдельный класс, который реализует интерфейс MathOperation, например AdditionOperation, с соответствующей логикой работы метода execute.

Создать класс OperationExecutor , который обладает методом void execute(MathOperation[] operations, double a, double b) и последовательно выполняет математические операции из массива с числами a и b.

Нефункциональные требования:
Вызвать метод execute и вывести на экран результат каждого из математических вычислений.
 */
public interface MathOperation {

    double compute(double a, double b);
}
