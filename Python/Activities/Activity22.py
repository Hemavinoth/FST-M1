'''
Docstring for tests.Activity22
Using pytest:

In the same file as the previous activity, do the following:

Apply the marker 'activity' to the last 2 test methods.
Run tests based on substring
Run tests based using the 'activity' marker.
'''
import pytest
def test_sum():
    assert (5 + 3) == 8
@pytest.mark.activity
def test_difference():
    assert (10 - 4) == 6
@pytest.mark.activity
def test_product():
    assert (7 * 6) == 42
def test_quotient():
    assert (20 / 5) == 4    

