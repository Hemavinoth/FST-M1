'''
Docstring for tests.Activity24
Using pytest:

Create a new test file and do the following:

Create a fixture named wallet() that initializes the variable 'amount' with 0
Create a test with the following parameters:



 
Write a test that performs the following scenario with the parameters
    My wallet initially has 0,
    I add {earned} units of cash to the wallet,
    I spend {spent} units of cash, and
    I should have {expected} units of cash remaining after the two transactions.
'''
import pytest
@pytest.fixture
def wallet():
    amount = 0
    return amount
@pytest.mark.parametrize("earned, spent, expected", [
    (50, 20, 30),
    (100, 40, 60),
    (200, 150, 50),
    (80, 30, 50)
])
def test_wallet_transactions(wallet, earned, spent, expected):
    wallet += earned
    wallet -= spent
    assert wallet == expected   
# --- IGNORE ---    

