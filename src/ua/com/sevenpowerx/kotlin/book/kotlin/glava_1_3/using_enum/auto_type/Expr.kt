package ua.com.sevenpowerx.kotlin.book.kotlin.glava_1_3.using_enum.auto_type

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr