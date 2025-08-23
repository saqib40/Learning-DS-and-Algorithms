fn largest (vec: Vec<i32>) -> i32 {
    let mut ans : i32 = vec[0];
    for x in vec.iter() {
        if *x > ans {
            ans = *x;
        }
    }
    return ans;
}

fn main() {
    let my_vector = vec![100, 200, 300];
    println!("{}", largest(my_vector));
}