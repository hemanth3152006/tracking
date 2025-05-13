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
        welcomeText.textContent = `Hi there, ${username}! Welcome to the system.`;
        welcomeMessage.style.display = 'block';

        // Hide the login form
        this.style.display = 'none';
    });
</script>