// https://www.hackerrank.com/challenges/a-very-big-sum

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

string arr_to_string(vector<int> &x) {
  string res = "";

  for(int i = 0; i < x.size(); i++) {
    res += to_string(x[i]);
  }

  return res;
}

vector<int> digit_arr(string x) {
  uint s = x.size();
  vector<int> n(s);

  for (int i = s - 1; i >= 0 ; i--) {
    n[i] = (int) x[i] - 48;
  }

  return n;
}

// @note: only works on positive numbers
vector<int> add_arr(vector<int> &x, vector<int> &y) {
  string::size_type sx = x.size();
  string::size_type sy = y.size();
  string::size_type s = max(sx, sy);

  vector<int> sum(s);
  int aux;
  int overflow = 0;

  for (int i = 0; i < s; i++) {
    aux = 0;

    if(i < sx) aux += x[sx - i - 1];
    if(i < sy) aux += y[sy - i - 1];
    aux += overflow;

    sum[i] = aux % 10;
    overflow = aux / 10;
  }

  // 921 + 322=(1)243
  if(overflow > 0) {
    sum.push_back(overflow);
  }

  reverse(sum.begin(), sum.end());

  return sum;
}

vector<int> add_arr(vector<int> &x, string y) {
  vector<int> vy = digit_arr(y);

  return add_arr(x, vy);
}

int main(){
    int n;
    cin >> n;

    vector<int> sum = {0};
    string x;

    for(int i = 0; i < n; i++) {
      cin >> x;
      // cout << arr_to_string(sum) << "+" << x << "=" << arr_to_string(add_arr(sum, x)) << endl;
      sum = add_arr(sum, x);
    }

    cout << arr_to_string(sum) << endl;

    return 0;
}