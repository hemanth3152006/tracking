<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Role Selection Login</title>
    <style>
        /* Your existing CSS styles */
    </style>
    <script src="inter.js" defer></script> <!-- Link the JavaScript file -->
</head>
<body>
    <div class="login-container">
        <h1>Select Role</h1>
        <div class="role-buttons">
            <button onclick="selectRole('Student')">Student Login</button>
            <button onclick="selectRole('Driver')">Driver Login</button>
            <button onclick="selectRole('Admin')">Administrative Login</button>
        </div>
        <form id="loginForm" role="" style="display: none;">
            <h2 id="roleTitle"></h2>
            <input type="text" placeholder="Username" required>
            <input type="password" placeholder="Password" required>
            <button type="submit">Login</button>
        </form>
        <div id="welcomeSection" style="display: none; text-align: center; margin-top: 20px;">
            <h2 id="welcomeNote"></h2>
            <p id="userDetails"></p>
        </div>
    </div>

    <script>
        document.getElementById('loginForm').addEventListener('submit', function (event) {
            event.preventDefault(); // Prevent the form from submitting

            // Get the username and role
            const username = this.querySelector('input[type="text"]').value;
            const role = this.getAttribute('role');

            // Display the welcome note
            const welcomeSection = document.getElementById('welcomeSection');
            const welcomeNote = document.getElementById('welcomeNote');
            const userDetails = document.getElementById('userDetails');
            welcomeNote.textContent = `Welcome, ${username}!`;
            userDetails.textContent = `You have logged in as a ${role}.`;
            welcomeSection.style.display = 'block';

            // Hide the login form
            this.style.display = 'none';
        });
    </script>
</body>
</html>