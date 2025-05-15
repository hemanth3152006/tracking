\basic.html -->
<script>
    function selectRole(role) {
        // Display the login form
        const loginForm = document.getElementById('loginForm');
        const roleTitle = document.getElementById('roleTitle');
        loginForm.style.display = 'block';
        roleTitle.textContent = `${role} Login`; // Update the title based on the selected role
        loginForm.setAttribute('role', role); // Set the role attribute for the form

        // Display the role image
        const roleImage = document.getElementById('roleImage');
        const roleImageSrc = document.getElementById('roleImageSrc');
        roleImage.style.display = 'block';

        // Update the image source based on the role
        if (role === 'Student') {
            roleImageSrc.src = 'student.png'; // Replace with the actual path to the student image
        } else if (role === 'Driver') {
            roleImageSrc.src = 'driver.png'; // Replace with the actual path to the driver image
        } else if (role === 'Admin') {
            roleImageSrc.src = 'admin.png'; // Replace with the actual path to the admin image
        }
    }

    function showLoading() {
        const loadingMessage = document.getElementById('loadingMessage');
        loadingMessage.style.display = 'flex'; // Show the loading animation
        document.body.classList.add('loading-active'); // Add blur effect to the background
    }

    function hideLoading() {
        const loadingMessage = document.getElementById('loadingMessage');
        loadingMessage.style.display = 'none'; // Hide the loading animation
        document.body.classList.remove('loading-active'); // Remove blur effect from the background
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
        showLoading(); // Show the loading animation

        // Redirect immediately
        window.location.href = "dashboard.html"; // Replace with your target page
    });
</script>