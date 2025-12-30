import requests
response = requests.get("https://training-support.com")
print("Response Code:", response.status_code)