public static int fatorial(int n) {
  int fat = 1;
  for (int i = 1; i <= n; ++i) {
    fat *= i;
  }
  return fat;
}
