import openai

# Set up your OpenAI API key
api_key = "your_api_key"
openai.api_key = api_key

def chat_with_gpt(prompt):
    # Send a prompt to the GPT-3 model and get a response
    response = openai.Completion.create(
        engine="text-davinci-002",
        prompt=prompt,
        temperature=0.7,
        max_tokens=150
    )
    return response.choices[0].text.strip()

if __name__ == "__main__":
    print("Welcome to ChatGPT!")
    print("Type 'exit' to end the conversation.")
    while True:
        user_input = input("You: ")
        if user_input.lower() == "exit":
            print("Goodbye!")
            break
        response = chat_with_gpt(user_input)
        print("ChatGPT:", response)
