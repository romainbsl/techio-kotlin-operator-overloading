operator fun Expr.plus(expr: Expr) = Expr(this.value + expr.value)