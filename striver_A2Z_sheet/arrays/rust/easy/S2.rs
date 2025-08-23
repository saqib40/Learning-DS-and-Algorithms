// function to get second largest element of array

fn getSecLar(arr: &[i32]) -> i32 { // works with Slices (&arr) and Vec<i32> as &vec.
    let mut lar : i32 = i32::MIN;
    let mut secLar : i32 = i32::MIN;
    for x in arr.iter() {
        if *x > lar {
            secLar = lar;
            lar = *x;
        }
        if *x > secLar && *x != lar {
            secLar = *x;
        }
    }
    return secLar;
}