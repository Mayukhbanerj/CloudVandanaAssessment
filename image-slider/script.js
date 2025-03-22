// Array of image URLs
const images = [
    "./image/slide0.jpg",
    "./image/slide1.jpg",
    "./image/slide2.jpg",
    "./image/slide3.jpg",
    "./image/slide4.jpg",
    "./image/slide5.jpg",
    "./image/slide6.jpg", 
];

// DOM Elements
const sliderImage = document.getElementById('sliderImage');
const prevBtn = document.getElementById('prevBtn');
const nextBtn = document.getElementById('nextBtn');

let currentIndex = 0;

// Function to display the current image
function showImage(index) {
    sliderImage.src = images[index];
}

// Event Listener for the "Next" button
nextBtn.addEventListener('click', () => {
    currentIndex = (currentIndex + 1) % images.length; // Loop back to the first image
    showImage(currentIndex);
});

// Event Listener for the "Previous" button
prevBtn.addEventListener('click', () => {
    currentIndex = (currentIndex - 1 + images.length) % images.length; // Loop back to the last image
    showImage(currentIndex);
});

// Display the first image when the page loads
showImage(currentIndex);