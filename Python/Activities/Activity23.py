'''
Docstring for tests.Activity23
Fixtures

Activity 23

Using pytest:

Create a new test file and do the following:

Create a fixture that initializes a list containing numbers from 0-10.
Write a test method asserting that the sum of that list is 55
Once you confirm that the test passes, move the fixture into the conftest.py file and rerun the test.
'''
import pytest
@pytest.fixture
def number_list():
    return list(range(11))
def test_sum_of_list(number_list):
    assert sum(number_list) == 55
# --- IGNORE ---
