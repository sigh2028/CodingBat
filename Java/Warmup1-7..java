//Question: Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
//Answer: public boolean nearHundred(int n) {
public boolean nearHundred(int n) {
  int nd1 = Math.abs(100-n);
  int nd2 = Math.abs(200-n);
  if (nd1<= 10 || nd2 <= 10) {
    return true;
}else{
  return false;
  }
}