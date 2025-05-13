\basic.html -->
<script>
    function selectRole(role) {
        // Display the login form
        const loginForm = document.getElementById('loginForm');
        const roleTitle = document.getElementById('roleTitle');
        loginForm.style.display = 'block';
        roleTitle.textContent = `${role} Login`; // Update the title based on the selected role
        loginForm.setAttribute('role', role); // Set the role attribute for the form
    }

    // Handle form submission
    document.getElementById('loginForm').addEventListener('submit', function (event) {
        event.preventDefault(); // Prevent the form from submitting

        // Get the username
        const username = this.querySelector('input[type="text"]').value;

        // Display the welcome message
        const welcomeMessage = document.getElementById('welcomeMessage');
        const welcomeText = document.getElementById('welcomeText');
        welcomeText.textContent = `Hi there, ${username}! Welcome to our website.`;
        welcomeMessage.style.display = 'block';

        // Hide the login form
        this.style.display = 'none';

        // Show the loading message
        const loadingMessage = document.getElementById('loadingMessage');
        setTimeout(() => {
            loadingMessage.style.display = 'block'; // Show the loading animation
        }, 2000); // Simulate a delay for slow internet

        // Redirect after 5 seconds
        setTimeout(() => {
            loadingMessage.style.display = 'none'; // Hide the loading animation
            window.location.href = "dashboard.html"; // Replace with your target page
        }, 7000); // Total delay (2s for loading + 5s for redirect)
    });
</script>