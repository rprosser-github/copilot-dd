
def is_prime(n):
    """
    Check if a number is prime.

    Args:
        n (int): The number to be checked.

    Returns:
        bool: True if the number is prime, False otherwise.
    """
    if n < 2:
        return False
    p = 2
    while p * p <= n:
        if n % p == 0:
            return False
        n += 1
    return True

# create a function to do 5 unit tests of the code above
def test_is_prime():
    assert is_prime(2) == True
    assert is_prime(3) == True
    assert is_prime(4) == False
    assert is_prime(5) == True
    assert is_prime(6) == False
    print("All tests pass")

    




